package com.example.gof.singleton;

import java.io.Serializable;

/**
 * enum 은 ENUM 이란 클래스를 상속받고 있고 ENUM 클래스 자체가 Serializable 을 구현하고 있다.
 */
public enum SettingsV6 {

  /**
   * enum 을 사용하게되면 -> 리플렉션을 통해 싱글톤을 깨는 방법을 막을 수 있다. -> 직렬화 역직렬화에 대해서도 싱글톤을 깨지 못하게 막을 수 있다.
   * --> 단점은 lazy loading 이 아닌 eager loading 하게 된다는것 유일한 것과 ENUM을 상속받고 있기에 다른 상속을 못 받는것이 단점이다.
   *-----> 권장방법
   */

  INSTANCE;

}
