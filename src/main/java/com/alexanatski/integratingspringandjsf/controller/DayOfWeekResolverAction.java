package com.alexanatski.integratingspringandjsf.controller;

import com.alexanatski.integratingspringandjsf.domain.DayOfWeekResolverForm;
import com.alexanatski.integratingspringandjsf.service.DayOfWeekResolverService;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class DayOfWeekResolverAction {
    private final DayOfWeekResolverService dayOfWeekResolverService;
    private final DayOfWeekResolverForm dayOfWeekResolverForm;

    public DayOfWeekResolverAction(DayOfWeekResolverService dayOfWeekResolverService,
                                   DayOfWeekResolverForm dayOfWeekResolverForm) {
        this.dayOfWeekResolverService = dayOfWeekResolverService;
        this.dayOfWeekResolverForm = dayOfWeekResolverForm;
    }

    public void determineDayOfWeek(){

        int year = dayOfWeekResolverForm.getYear();
        int month = dayOfWeekResolverForm.getMonth();
        int dayOfMonth = dayOfWeekResolverForm.getDayOfMonth();

        String dayOfWeekName = dayOfWeekResolverService.determineDayOfWeek(year, month, dayOfMonth);
        dayOfWeekResolverForm.setDayOfWeek(dayOfWeekName);
    }
}
