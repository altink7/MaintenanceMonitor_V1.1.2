package fh.slm.maintenancemonitor_v1_1_2.Monitor;

public class Monitor {
        private static String status = "-";

        public static String getStatus(){ //gibt den aktuellen Status zurück
            return status;
        }

        public static String setStatus(String s){//Hier wird der aktuelle Status überschrieben
            if (s != null && !s.isEmpty()) {
                status = s;
            }
            return status;
        }
    }

