package com.batch.working.BatchProcessing.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.stereotype.Component;

@Component
public class JobCompletionNotificationImpl implements JobExecutionListener {

    private Logger logger = LoggerFactory.getLogger(JobCompletionNotificationImpl.class);
    @Override
    public void beforeJob(JobExecution jobExecution) {
        logger.info("JOb started");
    }

    @Override
    public void afterJob(JobExecution jobExecution) {
        if (jobExecution.getStatus() == BatchStatus.COMPLETED) {
            logger.info("Job completed");
        }
    }
}
