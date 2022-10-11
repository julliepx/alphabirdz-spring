package com.example.bird;

import com.alphabirdz.model.Bird;
import com.alphabirdz.repository.BirdRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(classes = com.alphabirdz.AlphabirdzApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class BirdRepositoryTest {

        @Autowired
        private BirdRepository birdRepository;

    @Test
    public void shouldFindBirdById(){
        Bird bird = this.birdRepository.findById(1);
        assertThat(bird.getId()).isEqualTo(1);
        assertThat(bird.getEnglishName()).isEqualTo("Maguari Stork");
    }


}


