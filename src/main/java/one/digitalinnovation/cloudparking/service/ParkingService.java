package one.digitalinnovation.cloudparking.service;

import one.digitalinnovation.cloudparking.model.Parking;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class ParkingService {

    private static Map<String, Parking> parkingMap = new HashMap();
    
    static {
        var id = getUUID();
        var id2 = getUUID();
        Parking parking = new Parking(id, "hms-908", "SP", "Mercedes", "Branco");
        Parking parking2 = new Parking(id2, "jgs-908", "RJ", "BMW", "Vermelho");
        parkingMap.put(id, parking);
        parkingMap.put(id2, parking2);
    }

    public List<Parking> findAll(){
        return parkingMap.values().stream().collect(Collectors.toList());
    }

    private static String getUUID() {
        return UUID.randomUUID().toString().replace("-", "");
    }

    public Parking findById(String id) {
        return parkingMap.get(id);
    }
}
