/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import ferry.contract.AdminContract;
import ferry.dto.DepartureDetail;
import ferry.dto.FerryConfigDetail;
import ferry.dto.FerryDetail;
import ferry.dto.FerryIdentifier;
import ferry.dto.RouteDetail;
import ferry.dto.ScheduleDetail;
import ferry.dto.ScheduleIdentifier;
import ferry.eto.DataAccessException;
import ferry.eto.NoSuchFerryException;
import ferry.eto.NoSuchHarbourException;
import ferry.eto.NoSuchScheduleException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import jdk.nashorn.internal.runtime.arrays.ArrayLikeIterator;





/**
 *
 * @author Soren
 */
public class DummyBackEnd implements AdminContract {

    @Override
    public void delayFerry(FerryIdentifier ferryId, Date date, int depatureID, int delayTime) throws NoSuchFerryException, DataAccessException {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       
    }

    @Override
    public Collection<FerryDetail> showFerries() throws DataAccessException {
        Collection<FerryDetail> ferries = new ArrayList<FerryDetail>();
        ferries.add(new FerryDetail(1, "Ferry1", new HashSet<FerryConfigDetail>()));
        ferries.add(new FerryDetail(2, "Ferry2", new HashSet<FerryConfigDetail>()));
        
        return ferries; 
    }

    @Override
    public void addSchedule(ScheduleDetail schedule) throws DataAccessException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Collection<ScheduleDetail> showSchedules() throws NoSuchScheduleException {
       
        Collection<ScheduleDetail> shcedules = new ArrayList<ScheduleDetail>();
        shcedules.add(new ScheduleDetail(1, new Date(1418492669000l), new Date(1418492669000l), new HashSet<DepartureDetail>()));
        return shcedules;
    }

    @Override
    public Collection<ScheduleDetail> showSchedulesForDate(Date date) throws NoSuchScheduleException {
       
        Collection<ScheduleDetail> shcedules = new ArrayList<ScheduleDetail>();
        shcedules.add(new ScheduleDetail(1, new Date(1418492669000l), new Date(1418492669000l), new HashSet<DepartureDetail>()));
        return shcedules;
    }

    @Override
    public Collection<RouteDetail> showRoutes() throws NoSuchHarbourException {
        
        Collection<RouteDetail> routes = new ArrayList<RouteDetail>();
        routes.add(new RouteDetail(5, "Alexander Havn", "Søren Havn", 5000, 2));
          routes.add(new RouteDetail(9, "Tore Havn", "Angel Havn", 50000, 8));
        return routes;
    }

    @Override
    public void assignFerryToSchedule(FerryIdentifier ferryId, ScheduleIdentifier scheduleId) throws DataAccessException, NoSuchFerryException, NoSuchScheduleException {
    
    }

    /**
     * @param args the command line arguments
     */
}