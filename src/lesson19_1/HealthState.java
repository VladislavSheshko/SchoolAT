package lesson19_1;

public enum HealthState {
    HEALTHY("Здоровый"),
    UNHEALTHY("Нездоровый");
    String healtthAnimal;
    HealthState(String healtthAnimal) { this.healtthAnimal = healtthAnimal ;}
}
