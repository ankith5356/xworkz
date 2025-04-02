package com.xworkz.fitness.center;

import GymManager.GymManager;
import com.xworkz.fitness.FitnessCent;
import com.xworkz.fitness.train.Trainer;

public class FitCenterR {

        public static void main(String[] args) {
            FitnessCent FitnessCent = new FitnessCent();
            FitnessCent.centerId = 1;
            FitnessCent.centerName = "Peak Performance Gym";

            GymManager GymManager = new GymManager();
            GymManager.managerId = 1;
            GymManager.managerName = "Shubha";

            String[] trainerNamesList1 = {"naveen", "prathap", "Sam"};
            String[] trainerNamesList2 = {"vandhana", "peter"};
            Trainer[] trainers = new Trainer[2];

            Trainer trainer1 = new Trainer();
            trainer1.trainerId = 1;
            trainer1.trainerNames = trainerNamesList1;
            trainers[0] = trainer1;

            Trainer trainer2 = new Trainer();
            trainer2.trainerId = 2;
            trainer2.trainerNames = trainerNamesList2;
            trainers[1] = trainer2;

            GymManager.trainers = trainers;
            FitnessCent.manager = GymManager;

            FitnessCent.fetchDetails();
        }
}
