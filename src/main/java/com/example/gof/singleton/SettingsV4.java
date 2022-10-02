package com.example.gof.singleton;

public class SettingsV4 {

  /**
   * double-checked locking 방법
   * -> volatile 키워드를 붙여줘야한다.(자바 1.5 이상부터 동작)
   * 두번째 체킹에서 synchronized 를 쓰기에 좀 더 효율적이다.
   */
  private SettingsV4() {}

  private static volatile SettingsV4 instance;

  public static  synchronized SettingsV4 getInstance() {
    if (instance == null) {
      synchronized (SettingsV4.class) {
        if (instance == null) {
          instance = new SettingsV4();
        }
      }
    }
    return instance;
  }

}
