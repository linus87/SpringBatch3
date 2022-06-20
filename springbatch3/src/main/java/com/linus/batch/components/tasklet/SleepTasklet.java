package com.linus.batch.components.tasklet;

import java.time.LocalDateTime;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

public class SleepTasklet implements Tasklet {

    public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws Exception {
        
        System.out.println(LocalDateTime.now());
        return null;
    }

}
