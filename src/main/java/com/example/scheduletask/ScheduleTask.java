package com.example.scheduletask;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduleTask {

  @Scheduled(cron = "${cron.expression}")
  @Async
  private void doTheRealJob() {

    final Logger log = LoggerFactory.getLogger(ScheduleTask.class);
    SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    log.info(
      "The time is now {}, in Luanda !!!",
      dateFormat.format(new Date())
    );
  }
}
