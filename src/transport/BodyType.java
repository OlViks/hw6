package transport;


public enum BodyType { SEDAN("Седан"),
    HATCHBACK("Хетчбек"),
    COUPE("Купе"),
    UNIVERSAL("Универсал"),
    OFF_ROAD("Внедорожник"),
    CROSSOVER("Кроссовер"),
    PICKUP("Пикап"),
    MINIVAN("Фургон");

    private final String name;

    BodyType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Тип кузова " + this.name ;
    }
}


