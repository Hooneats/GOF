package com.example.gof.factory.after;

public interface ShipFactory {

  default Ship orderShip(String name, String email) {
    validate(name, email);
    Ship ship = createShip();
    sendEmailTo(email, ship);
    return ship;
  }

  private void sendEmailTo(String email, Ship ship) {
    System.out.println(ship.getName() + " 다 만들었습니다.");
  }

  // default 또는 private 메서드가 아니기에 createShip 은 반드시 하위 클래스에서 정의 되어져야 한다.
  Ship createShip();

  private void validate(String name, String email) {
    if (name == null || name.isBlank()) {
      throw new IllegalArgumentException("배 이름을 지어주세요.");
    }
    if (email == null || email.isBlank()) {
      throw new IllegalArgumentException("연락처를 남겨주세요.");
    }
  }


  private void prepareFor(String name) {
    System.out.println(name + " 만들 준비 중");
  }
}
