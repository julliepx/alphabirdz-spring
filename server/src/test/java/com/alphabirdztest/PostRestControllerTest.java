package com.alphabirdztest;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.alphabirdz.controller.PostRestController;
import com.alphabirdz.model.Post;
import com.alphabirdz.repository.PostRepository;

@SpringBootTest(classes = com.alphabirdz.AlphabirdzApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class PostRestControllerTest {

    @Autowired
    private PostRestController postRestController;

    @MockBean
    private PostRepository postRepository;

    private Post post;
    private List<Post> posts = new ArrayList<Post>();
    private MockMvc mockMvc;

    @Before
    public void initOwners() {
        this.mockMvc = MockMvcBuilders.standaloneSetup(postRestController)
                    .build();
        
        post = new Post("url image", "Condado", "2890", 1, 1);
        posts.add(post);

    }
    @Test
    public void testGetPostIdSuccess() throws Exception {
        given(this.postRepository.findById(0)).willReturn(post);
        this.mockMvc.perform(get("/posts/id/0")
                .accept(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON))
            .andExpect(jsonPath("$.location").value("Condado"));
    }

    @Test
    public void testGetPostIdNotFound() throws Exception {
        given(this.postRepository.findById(999)).willReturn(null);
        this.mockMvc.perform(get("/posts/id/999")
                .accept(MediaType.APPLICATION_JSON))
            .andExpect(status().isNotFound());
    }

    @Test
    public void testGetAllPostNotFound() throws Exception {
        given(this.postRepository.findAll()).willReturn(null);
        this.mockMvc.perform(get("/posts/all")
                .accept(MediaType.APPLICATION_JSON))
            .andExpect(status().isNotFound());
    }


    @Test
    public void testGetAllPostSuccess() throws Exception {
        given(this.postRepository.findAll()).willReturn(posts);
        this.mockMvc.perform(get("/posts/all")
                .accept(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk())
            .andExpect(content().string("[{\"id\":0,\"image\":\"url image\",\"location\":\"Condado\",\"date\":\"2890\",\"user\":1,\"bird\":1}]"));
    }
}