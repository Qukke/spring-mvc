package web.model;

import java.util.List;

public class Car {

    private Long vin;
    private String model;
    private String series;

    public Car(Long vin, String model, String series) {
        this.vin = vin;
        this.model = model;
        this.series = series;
    }

    @Override
    public String toString() {
        return "Car{" +
                "vin=" + vin +
                ", model='" + model + '\'' +
                ", series='" + series + '\'' +
                '}';
    }

    public Long getVin() {
        return vin;
    }

    public void setVin(Long vin) {
        this.vin = vin;
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
}

/*
<div>
    <th:block th:each="msg : ${list}">
        <h1 th:text="${msg}"></h1>
    </th:block>
</div>
 */