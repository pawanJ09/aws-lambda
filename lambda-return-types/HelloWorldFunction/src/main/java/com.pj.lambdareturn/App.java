package com.pj.lambdareturn;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.pj.lambdareturn.Clinical;
import com.pj.lambdareturn.Patient;

public class App {
  public int getNumber(float input) {
    return (int) input;
  }

  public List<Integer> getScores(List<String> names) {
    Map<String, Integer> studentScoresMap = new HashMap<>();
    studentScoresMap.put("John", 80);
    studentScoresMap.put("Bob", 90);
    studentScoresMap.put("Alice", 100);

    List<Integer> scores = new LinkedList<>();
    names.forEach(name -> {
      scores.add(studentScoresMap.get(name));
    });
    return scores;
  }

  public Clinical getClinicals(Patient patient) {
    System.out.println("Patient details: " + patient);
    Clinical clinical = new Clinical();
    clinical.setBp("80/120");
    clinical.setHeartRate(78);
    return clinical;
  }
}
