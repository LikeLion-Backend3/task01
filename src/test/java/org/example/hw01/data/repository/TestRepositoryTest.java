package org.example.hw01.data.repository;

import org.example.hw01.data.entity.BabyLion;
import org.example.hw01.data.entity.Task;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class TaskRepositoryTest {

    @Autowired
    BabyLionRepository babyLionRepository;

    @Autowired
    TaskRepository taskRepository;

    @Test
    void taskTask(){

        // 테스트 데이터 생성
        BabyLion babyLion = new BabyLion();
        babyLion.setName("황형진");
        babyLion.setMajor("소프트웨어전공");
        babyLion.setEmail("gudwls10@kangnam.ac.kr");
        babyLion.setPhonenum("010-3036-9968");
        babyLion.setPassword("2580");
        babyLion.setProfile("pic0");

        BabyLion babyLion1 = new BabyLion();
        babyLion1.setName("황형진1");
        babyLion1.setMajor("데이터사이언스전공");
        babyLion1.setEmail("gudwlsdlsms1@naver.com");
        babyLion1.setPhonenum("010-6363-7912");
        babyLion1.setPassword("1111");
        babyLion1.setProfile("pic1");


        BabyLion babyLion2 = new BabyLion();
        babyLion2.setName("황형진2");
        babyLion2.setMajor("산업경영전공");
        babyLion2.setEmail("ghkdgduwls10@nave.com");
        babyLion2.setPhonenum("010-1234-1234");
        babyLion2.setPassword("1234");
        babyLion2.setProfile("pic2");

        BabyLion babyLion3 = new BabyLion();
        babyLion3.setName("황형진3");
        babyLion3.setMajor("경영학전공");
        babyLion3.setEmail("botherhwang12@gmail.com");
        babyLion3.setPhonenum("010-9999-9999");
        babyLion3.setPassword("9865");
        babyLion3.setProfile("pic3");

        babyLionRepository.save(babyLion);
        babyLionRepository.save(babyLion1);
        babyLionRepository.save(babyLion2);
        babyLionRepository.save(babyLion3);

        Task task = new Task();
        task.setTaskName("1팀");
        task.getMembers().add(babyLion);
        task.getMembers().add(babyLion1);

        Task task1 = new Task();
        task1.setTaskName("2팀");
        task1.getMembers().add(babyLion2);
        task1.getMembers().add(babyLion3);

        taskRepository.save(task);
        taskRepository.save(task1);
        List<BabyLion> members = taskRepository.findById(1L).get().getMembers();

        for(BabyLion foundBabyLion : members){
            System.out.println(babyLion);
        }
    }


}
