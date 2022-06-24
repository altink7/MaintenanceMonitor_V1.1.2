package fh.slm.maintenancemonitor_v1_1_2.Controller;
import fh.slm.maintenancemonitor_v1_1_2.Monitor.Monitor;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api/monitoring")
public class MaintenanceController {

    @GetMapping()
    public String getStatus(){
        return Monitor.getStatus();
    }

    @GetMapping("{status}")
    public String setStatus(@PathVariable("status") String s){
        return Monitor.setStatus(s);
    }
}