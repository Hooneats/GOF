package com.example.gof.singleton;

import java.io.Serializable;

public class SettingsV5 implements Serializable {

  /**
   * Holder 를 사용하는 방법 ( static inner class 활용 권장 )
   * static inner 클래스 사용하는 (권장)방법
   * -> 멀티 쓰레드 환경에서도 안전하며, lazy loading 또한 가능하다.
   */
  private SettingsV5() {}

  private static class SettingsHolder {
    private static final SettingsV5 INSTANCE = new SettingsV5();
  }

  public static  synchronized SettingsV5 getInstance() {
    return SettingsHolder.INSTANCE;
  }

  // TODO 역질혈화 대응 ---> 역질렬화 할때 readResolve를 사용하게된다. --> 동일한 객체를 반환하게된다.
  protected Object readResolve() {
    return getInstance();
  }

}
