package com.wboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wboot.**.dao")
public class WbootSqliteApplication {

  public static void main(String[] args) {
    SpringApplication.run(WbootSqliteApplication.class, args);
    System.out.println("ヾ(◍°∇°◍)ﾉﾞ    wboot启动成功      ヾ(◍°∇°◍)ﾉﾞ\n" +
      " _    _      _ _        __          __        _     _ \n" +
      "| |  | |    | | |       \\ \\        / /       | |   | |\n" +
      "| |__| | ___| | | ___    \\ \\  /\\  / /__  _ __| | __| |\n" +
      "|  __  |/ _ \\ | |/ _ \\    \\ \\/  \\/ / _ \\| '__| |/ _` |\n" +
      "| |  | |  __/ | | (_) |    \\  /\\  / (_) | |  | | (_| |\n" +
      "|_|  |_|\\___|_|_|\\___/      \\/  \\/ \\___/|_|  |_|\\__,_|");
  }
}
