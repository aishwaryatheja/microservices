package com.aishwarya.profilemanagement.service;

import com.aishwarya.profilemanagement.domain.EmployeeProfile;
import java.util.List;

public interface EmployeeProfileService {
    void addEmployeeProfile(EmployeeProfile profile);
    List < EmployeeProfile > getEmployeeProfiles();
}