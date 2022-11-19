package one.digitalinnovation.cloudparking.service;

import jdk.jshell.Util;
import one.digitalinnovation.cloudparking.model.Parking;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class ParkingService {

    private static final String UUID = getUUID();
    private static Map<String, Parking> parkingMap = new HashMap();

        static {
            var id = getUUID();
            Parking parking = new Parking(id, "dms=8888", "RN", "BMW", "Cinza");
            parkingMap.put(id, parking);
        }
    public List<Parking> findAll(){
          return new ArrayList<>(parkingMap.values());
    }



    public static String getUUID() {
        return Objects.requireNonNull(UUID).toString().replace("-", "");
    }

}
