package web.model;

import java.util.Objects;

public class Car {
    private Long id;
    private int createYear;
    private String model;
    private String series;

    public Car() {
    }

    public Car(int createYear, String model, String series) {
        this.createYear = createYear;
        this.model = model;
        this.series = series;
    }

    public Car(Long id, int createYear, String model, String series) {
        this.id = id;
        this.createYear = createYear;
        this.model = model;
        this.series = series;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getCreateYear() {
        return createYear;
    }

    public void setCreateYear(int createYear) {
        this.createYear = createYear;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", createYear=" + createYear +
                ", model='" + model + '\'' +
                ", series='" + series + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return createYear == car.createYear && Objects.equals(id, car.id) && Objects.equals(model, car.model) && Objects.equals(series, car.series);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, createYear, model, series);
    }
}
