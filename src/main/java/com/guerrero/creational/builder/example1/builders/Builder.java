package com.guerrero.creational.builder.example1.builders;

import com.guerrero.creational.builder.example1.cars.CarType;
import com.guerrero.creational.builder.example1.components.Engine;
import com.guerrero.creational.builder.example1.components.GPSNavigator;
import com.guerrero.creational.builder.example1.components.Transmission;
import com.guerrero.creational.builder.example1.components.TripComputer;

/**
 * Builder interface defines all possible ways to configure a product.
 */
public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
