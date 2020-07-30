package com.alexanatski.integratingspringandjsf.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Getter
@Setter
@Component
@SessionScope
public class DayOfWeekResolverForm {

    private int year;
    private int month;
    private int dayOfMonth;

    private String dayOfWeek;
}

