package com.greenfox.model;

import lombok.Getter;
import lombok.Setter;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Getter
@Setter
public class Fox {
  private String name;
  private List<Trick> knownTricks;
  private Food food;
  private Drink drink;
  private boolean she;
  private boolean authenticated;
  private List<String> targetList;

  public Fox() {
    name = "Charles";
    knownTricks = new ArrayList<>();
    food = Food.PIZZA;
    drink = Drink.TEE;
    she = false;
    authenticated = false;
    targetList = new ArrayList<>();
  }

  public void learnNewTrick(Trick trick) {
    knownTricks.add(trick);
  }

  public void hack() throws Exception {
    Document doc = Jsoup.connect("http://localhost:8080/fakeHack").get();
    Element form = doc.select("form").first();
    Elements options = form.select("option");
    for (Element elem : options) {
      String current = elem.attr("value");
      if (isUnique(current)) {
        targetList.add(current);
      }
    }
  }

  public boolean isUnique(String current) {
    for (String target : targetList) {
      if (target.equals(current)) {
        return false;
      }
    }
    return true;
  }
}
