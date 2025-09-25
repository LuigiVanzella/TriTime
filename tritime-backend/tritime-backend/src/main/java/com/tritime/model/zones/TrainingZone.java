package com.tritime.model.zones;

import jakarta.persistence.*;
import com.tritime.model.User;

@Entity
@Table(name = "training_zones")
public class TrainingZone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    // Natação (por 100m, min e seg)
    private Integer swimZ1Min;
    private Integer swimZ1Sec;
    private Integer swimZ2Min;
    private Integer swimZ2Sec;
    private Integer swimZ3Min;
    private Integer swimZ3Sec;
    private Integer swimZ4Min;
    private Integer swimZ4Sec;
    private Integer swimZ5Min;
    private Integer swimZ5Sec;

    // Ciclismo (km/h)
    private Double bikeZ1;
    private Double bikeZ2;
    private Double bikeZ3;
    private Double bikeZ4;
    private Double bikeZ5;

    // Corrida (por km, min e seg)
    private Integer runZ1Min;
    private Integer runZ1Sec;
    private Integer runZ2Min;
    private Integer runZ2Sec;
    private Integer runZ3Min;
    private Integer runZ3Sec;
    private Integer runZ4Min;
    private Integer runZ4Sec;
    private Integer runZ5Min;
    private Integer runZ5Sec;

    public TrainingZone() {}

    // Aqui você pode criar um construtor completo ou apenas usar setters

    // --- Getters e Setters ---

    public Long getId() { return id; }
    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }

    // swimming
    public Integer getSwimZ1Min() { return swimZ1Min; }
    public void setSwimZ1Min(Integer swimZ1Min) { this.swimZ1Min = swimZ1Min; }
    public Integer getSwimZ1Sec() { return swimZ1Sec; }
    public void setSwimZ1Sec(Integer swimZ1Sec) { this.swimZ1Sec = swimZ1Sec; }

    public Integer getSwimZ2Min() { return swimZ2Min; }
    public void setSwimZ2Min(Integer swimZ2Min) { this.swimZ2Min = swimZ2Min; }
    public Integer getSwimZ2Sec() { return swimZ2Sec; }
    public void setSwimZ2Sec(Integer swimZ2Sec) { this.swimZ2Sec = swimZ2Sec; }

    public Integer getSwimZ3Min() { return swimZ3Min; }
    public void setSwimZ3Min(Integer swimZ3Min) { this.swimZ3Min = swimZ3Min; }
    public Integer getSwimZ3Sec() { return swimZ3Sec; }
    public void setSwimZ3Sec(Integer swimZ3Sec) { this.swimZ3Sec = swimZ3Sec; }

    public Integer getSwimZ4Min() { return swimZ4Min; }
    public void setSwimZ4Min(Integer swimZ4Min) { this.swimZ4Min = swimZ4Min; }
    public Integer getSwimZ4Sec() { return swimZ4Sec; }
    public void setSwimZ4Sec(Integer swimZ4Sec) { this.swimZ4Sec = swimZ4Sec; }

    public Integer getSwimZ5Min() { return swimZ5Min; }
    public void setSwimZ5Min(Integer swimZ5Min) { this.swimZ5Min = swimZ5Min; }
    public Integer getSwimZ5Sec() { return swimZ5Sec; }
    public void setSwimZ5Sec(Integer swimZ5Sec) { this.swimZ5Sec = swimZ5Sec; }


    //bike
    public Double getBikeZ1() { return bikeZ1; }
    public void setBikeZ1(Double bikeZ1) { this.bikeZ1 = bikeZ1; }

    public Double getBikeZ2() { return bikeZ2; }
    public void setBikeZ2(Double bikeZ2) { this.bikeZ2 = bikeZ2; }

    public Double getBikeZ3() { return bikeZ3; }
    public void setBikeZ3(Double bikeZ3) { this.bikeZ3 = bikeZ3; }

    public Double getBikeZ4() { return bikeZ4; }
    public void setBikeZ4(Double bikeZ4) { this.bikeZ4 = bikeZ4; }

    public Double getBikeZ5() { return bikeZ5; }
    public void setBikeZ5(Double bikeZ5) { this.bikeZ5 = bikeZ5; }


    //run
    public Integer getRunZ1Min() { return runZ1Min; }
    public void setRunZ1Min(Integer runZ1Min) { this.runZ1Min = runZ1Min; }
    public Integer getRunZ1Sec() { return runZ1Sec; }
    public void setRunZ1Sec(Integer runZ1Sec) { this.runZ1Sec = runZ1Sec; }

    public Integer getRunZ2Min() { return runZ2Min; }
    public void setRunZ2Min(Integer runZ2Min) { this.runZ2Min = runZ2Min; }
    public Integer getRunZ2Sec() { return runZ2Sec; }
    public void setRunZ2Sec(Integer runZ2Sec) { this.runZ2Sec = runZ2Sec; }

    public Integer getRunZ3Min() { return runZ3Min; }
    public void setRunZ3Min(Integer runZ3Min) { this.runZ3Min = runZ3Min; }
    public Integer getRunZ3Sec() { return runZ3Sec; }
    public void setRunZ3Sec(Integer runZ3Sec) { this.runZ3Sec = runZ3Sec; }

    public Integer getRunZ4Min() { return runZ4Min; }
    public void setRunZ4Min(Integer runZ4Min) { this.runZ4Min = runZ4Min; }
    public Integer getRunZ4Sec() { return runZ4Sec; }
    public void setRunZ4Sec(Integer runZ4Sec) { this.runZ4Sec = runZ4Sec; }

    public Integer getRunZ5Min() { return runZ5Min; }
    public void setRunZ5Min(Integer runZ5Min) { this.runZ5Min = runZ5Min; }
    public Integer getRunZ5Sec() { return runZ5Sec; }
    public void setRunZ5Sec(Integer runZ5Sec) { this.runZ5Sec = runZ5Sec; }

}
