package com.fh.service;

import com.fh.model.*;

import java.util.List;

public interface FlightService {
    void queryFlight(Bean<Flight> bean);

    List<Area> xiala1();

    List<Area> xiala2(int id);

    List<Area> xiala3(int id);

    List<Area> xialaa();

    List<Area> xialab(int id);

    List<Area> xialac(int id);

    List<Type> queryJixing();

    List<TicketName> queryJipiao();

    void addflight(Flight flight);

    void shanchu(int id);

    Flight toUpdate(int id);

    void updateflight(Flight flight);
}
