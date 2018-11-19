package com.example.demo.quartz;

import com.example.demo.dao.SportRepository;
import com.example.demo.entity.Sport;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
public class Jobs {
    @Resource
    private SportRepository sportRepository;

    public static List<Sport> rankingList = null;

    @Scheduled(cron = "0 35 22 * * ?")
    public void ranking() {
        rankingList = sportRepository.getAll();
        System.out.println(rankingList);
    }

    public List<Sport> rank() {
        return rankingList;
    }
}