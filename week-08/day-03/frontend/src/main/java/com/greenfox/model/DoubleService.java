package com.greenfox.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Service
@Setter
@Getter
public class DoubleService {
  private int received;
  private int result;
}
