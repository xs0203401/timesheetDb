package com.demo.timesheet.repository;

import com.demo.timesheet.entity.TimesheetRegister;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TimesheetRegisterService extends JpaRepository<TimesheetRegister, Integer> {
}
