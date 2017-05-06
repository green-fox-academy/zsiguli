package com.greenfox.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Getter
@Component
public class TrickList {
  private List<Trick> tricks;

  public TrickList() {
    tricks = new ArrayList<>();
    tricks.add(new Trick("Say blabla", 99));
    tricks.add(new Trick("Say blabla again", 288));
  }

  public void addNewTrick(Trick trick) {
    tricks.add(trick);
  }

  public void removeTrick(Trick trickToRemove) {
    for (int i = 0; i < tricks.size(); ++i) {
      if(tricks.get(i).getDescription().equals(trickToRemove.getDescription()) &&
              tricks.get(i).getDifficulty() == trickToRemove.getDifficulty()) {
        tricks.remove(i);
        return;
      }
    }
  }
}
