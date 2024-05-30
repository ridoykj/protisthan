package com.itbd.application.db.dto.employee;

import com.itbd.application.db.dao.setup.employee.EmployeeDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public record EmployeeDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String employee,
        String namingSeries,
        String firstName,
        String middleName,
        String lastName,
        String employeeName,
        String gender,
        LocalDate dateOfBirth,
        String salutation,
        LocalDate dateOfJoining,
        String image,
        String status,
        String userId,
        Boolean createUserPermission,
        String company,
        String department,
        String employeeNumber,
        String designation,
        String reportsTo,
        String branch,
        LocalDate scheduledConfirmationDate,
        LocalDate finalConfirmationDate,
        LocalDate contractEndDate,
        Integer noticeNumberOfDays,
        LocalDate dateOfRetirement,
        String cellNumber,
        String personalEmail,
        String companyEmail,
        String preferredContactEmail,
        String preferredEmail,
        Boolean unsubscribed,
        String currentAddress,
        String currentAccommodationType,
        String permanentAddress,
        String permanentAccommodationType,
        String personToBeContacted,
        String emergencyPhoneNumber,
        String relation,
        String attendanceDeviceId,
        String holidayList,
        BigDecimal ctc,
        String salaryCurrency,
        String salaryMode,
        String bankName,
        String bankAcNo,
        String iban,
        String maritalStatus,
        String familyBackground,
        String bloodGroup,
        String healthDetails,
        String passportNumber,
        LocalDate validUpto,
        LocalDate dateOfIssue,
        String placeOfIssue,
        String bio,
        LocalDate resignationLetterDate,
        LocalDate relievingDate,
        LocalDate heldOn,
        String newWorkplace,
        String leaveEncashed,
        LocalDate encashmentDate,
        String reasonForLeaving,
        String feedback,
        Integer lft,
        Integer rgt,
        String oldParent,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static EmployeeDto fromEntity(EmployeeDao eEmployeeDao) {
        return new EmployeeDto(
                eEmployeeDao.getName(),
                eEmployeeDao.getCreation(),
                eEmployeeDao.getModified(),
                eEmployeeDao.getModifiedBy(),
                eEmployeeDao.getOwner(),
                eEmployeeDao.getIsDocStatus(),
                eEmployeeDao.getIdx(),
                eEmployeeDao.getEmployee(),
                eEmployeeDao.getNamingSeries(),
                eEmployeeDao.getFirstName(),
                eEmployeeDao.getMiddleName(),
                eEmployeeDao.getLastName(),
                eEmployeeDao.getEmployeeName(),
                eEmployeeDao.getGender(),
                eEmployeeDao.getDateOfBirth(),
                eEmployeeDao.getSalutation(),
                eEmployeeDao.getDateOfJoining(),
                eEmployeeDao.getImage(),
                eEmployeeDao.getStatus(),
                eEmployeeDao.getUserId(),
                eEmployeeDao.getCreateUserPermission(),
                eEmployeeDao.getCompany(),
                eEmployeeDao.getDepartment(),
                eEmployeeDao.getEmployeeNumber(),
                eEmployeeDao.getDesignation(),
                eEmployeeDao.getReportsTo(),
                eEmployeeDao.getBranch(),
                eEmployeeDao.getScheduledConfirmationDate(),
                eEmployeeDao.getFinalConfirmationDate(),
                eEmployeeDao.getContractEndDate(),
                eEmployeeDao.getNoticeNumberOfDays(),
                eEmployeeDao.getDateOfRetirement(),
                eEmployeeDao.getCellNumber(),
                eEmployeeDao.getPersonalEmail(),
                eEmployeeDao.getCompanyEmail(),
                eEmployeeDao.getPreferredContactEmail(),
                eEmployeeDao.getPreferredEmail(),
                eEmployeeDao.getUnsubscribed(),
                eEmployeeDao.getCurrentAddress(),
                eEmployeeDao.getCurrentAccommodationType(),
                eEmployeeDao.getPermanentAddress(),
                eEmployeeDao.getPermanentAccommodationType(),
                eEmployeeDao.getPersonToBeContacted(),
                eEmployeeDao.getEmergencyPhoneNumber(),
                eEmployeeDao.getRelation(),
                eEmployeeDao.getAttendanceDeviceId(),
                eEmployeeDao.getHolidayList(),
                eEmployeeDao.getCtc(),
                eEmployeeDao.getSalaryCurrency(),
                eEmployeeDao.getSalaryMode(),
                eEmployeeDao.getBankName(),
                eEmployeeDao.getBankAcNo(),
                eEmployeeDao.getIban(),
                eEmployeeDao.getMaritalStatus(),
                eEmployeeDao.getFamilyBackground(),
                eEmployeeDao.getBloodGroup(),
                eEmployeeDao.getHealthDetails(),
                eEmployeeDao.getPassportNumber(),
                eEmployeeDao.getValidUpto(),
                eEmployeeDao.getDateOfIssue(),
                eEmployeeDao.getPlaceOfIssue(),
                eEmployeeDao.getBio(),
                eEmployeeDao.getResignationLetterDate(),
                eEmployeeDao.getRelievingDate(),
                eEmployeeDao.getHeldOn(),
                eEmployeeDao.getNewWorkplace(),
                eEmployeeDao.getLeaveEncashed(),
                eEmployeeDao.getEncashmentDate(),
                eEmployeeDao.getReasonForLeaving(),
                eEmployeeDao.getFeedback(),
                eEmployeeDao.getLft(),
                eEmployeeDao.getRgt(),
                eEmployeeDao.getOldParent(),
                eEmployeeDao.getUserTags(),
                eEmployeeDao.getComments(),
                eEmployeeDao.getAssign(),
                eEmployeeDao.getLikedBy());
    }

    public static void fromDTO(EmployeeDto vEmployeeDto, EmployeeDao eEmployeeDao) {
        eEmployeeDao.setName(vEmployeeDto.name());
        eEmployeeDao.setCreation(vEmployeeDto.creation());
        eEmployeeDao.setModified(vEmployeeDto.modified());
        eEmployeeDao.setModifiedBy(vEmployeeDto.modifiedBy());
        eEmployeeDao.setOwner(vEmployeeDto.owner());
        eEmployeeDao.setIsDocStatus(vEmployeeDto.isDocStatus());
        eEmployeeDao.setIdx(vEmployeeDto.idx());
        eEmployeeDao.setEmployee(vEmployeeDto.employee());
        eEmployeeDao.setNamingSeries(vEmployeeDto.namingSeries());
        eEmployeeDao.setFirstName(vEmployeeDto.firstName());
        eEmployeeDao.setMiddleName(vEmployeeDto.middleName());
        eEmployeeDao.setLastName(vEmployeeDto.lastName());
        eEmployeeDao.setEmployeeName(vEmployeeDto.employeeName());
        eEmployeeDao.setGender(vEmployeeDto.gender());
        eEmployeeDao.setDateOfBirth(vEmployeeDto.dateOfBirth());
        eEmployeeDao.setSalutation(vEmployeeDto.salutation());
        eEmployeeDao.setDateOfJoining(vEmployeeDto.dateOfJoining());
        eEmployeeDao.setImage(vEmployeeDto.image());
        eEmployeeDao.setStatus(vEmployeeDto.status());
        eEmployeeDao.setUserId(vEmployeeDto.userId());
        eEmployeeDao.setCreateUserPermission(vEmployeeDto.createUserPermission());
        eEmployeeDao.setCompany(vEmployeeDto.company());
        eEmployeeDao.setDepartment(vEmployeeDto.department());
        eEmployeeDao.setEmployeeNumber(vEmployeeDto.employeeNumber());
        eEmployeeDao.setDesignation(vEmployeeDto.designation());
        eEmployeeDao.setReportsTo(vEmployeeDto.reportsTo());
        eEmployeeDao.setBranch(vEmployeeDto.branch());
        eEmployeeDao.setScheduledConfirmationDate(vEmployeeDto.scheduledConfirmationDate());
        eEmployeeDao.setFinalConfirmationDate(vEmployeeDto.finalConfirmationDate());
        eEmployeeDao.setContractEndDate(vEmployeeDto.contractEndDate());
        eEmployeeDao.setNoticeNumberOfDays(vEmployeeDto.noticeNumberOfDays());
        eEmployeeDao.setDateOfRetirement(vEmployeeDto.dateOfRetirement());
        eEmployeeDao.setCellNumber(vEmployeeDto.cellNumber());
        eEmployeeDao.setPersonalEmail(vEmployeeDto.personalEmail());
        eEmployeeDao.setCompanyEmail(vEmployeeDto.companyEmail());
        eEmployeeDao.setPreferredContactEmail(vEmployeeDto.preferredContactEmail());
        eEmployeeDao.setPreferredEmail(vEmployeeDto.preferredEmail());
        eEmployeeDao.setUnsubscribed(vEmployeeDto.unsubscribed());
        eEmployeeDao.setCurrentAddress(vEmployeeDto.currentAddress());
        eEmployeeDao.setCurrentAccommodationType(vEmployeeDto.currentAccommodationType());
        eEmployeeDao.setPermanentAddress(vEmployeeDto.permanentAddress());
        eEmployeeDao.setPermanentAccommodationType(vEmployeeDto.permanentAccommodationType());
        eEmployeeDao.setPersonToBeContacted(vEmployeeDto.personToBeContacted());
        eEmployeeDao.setEmergencyPhoneNumber(vEmployeeDto.emergencyPhoneNumber());
        eEmployeeDao.setRelation(vEmployeeDto.relation());
        eEmployeeDao.setAttendanceDeviceId(vEmployeeDto.attendanceDeviceId());
        eEmployeeDao.setHolidayList(vEmployeeDto.holidayList());
        eEmployeeDao.setCtc(vEmployeeDto.ctc());
        eEmployeeDao.setSalaryCurrency(vEmployeeDto.salaryCurrency());
        eEmployeeDao.setSalaryMode(vEmployeeDto.salaryMode());
        eEmployeeDao.setBankName(vEmployeeDto.bankName());
        eEmployeeDao.setBankAcNo(vEmployeeDto.bankAcNo());
        eEmployeeDao.setIban(vEmployeeDto.iban());
        eEmployeeDao.setMaritalStatus(vEmployeeDto.maritalStatus());
        eEmployeeDao.setFamilyBackground(vEmployeeDto.familyBackground());
        eEmployeeDao.setBloodGroup(vEmployeeDto.bloodGroup());
        eEmployeeDao.setHealthDetails(vEmployeeDto.healthDetails());
        eEmployeeDao.setPassportNumber(vEmployeeDto.passportNumber());
        eEmployeeDao.setValidUpto(vEmployeeDto.validUpto());
        eEmployeeDao.setDateOfIssue(vEmployeeDto.dateOfIssue());
        eEmployeeDao.setPlaceOfIssue(vEmployeeDto.placeOfIssue());
        eEmployeeDao.setBio(vEmployeeDto.bio());
        eEmployeeDao.setResignationLetterDate(vEmployeeDto.resignationLetterDate());
        eEmployeeDao.setRelievingDate(vEmployeeDto.relievingDate());
        eEmployeeDao.setHeldOn(vEmployeeDto.heldOn());
        eEmployeeDao.setNewWorkplace(vEmployeeDto.newWorkplace());
        eEmployeeDao.setLeaveEncashed(vEmployeeDto.leaveEncashed());
        eEmployeeDao.setEncashmentDate(vEmployeeDto.encashmentDate());
        eEmployeeDao.setReasonForLeaving(vEmployeeDto.reasonForLeaving());
        eEmployeeDao.setFeedback(vEmployeeDto.feedback());
        eEmployeeDao.setLft(vEmployeeDto.lft());
        eEmployeeDao.setRgt(vEmployeeDto.rgt());
        eEmployeeDao.setOldParent(vEmployeeDto.oldParent());
        eEmployeeDao.setUserTags(vEmployeeDto.userTags());
        eEmployeeDao.setComments(vEmployeeDto.comments());
        eEmployeeDao.setAssign(vEmployeeDto.assign());
        eEmployeeDao.setLikedBy(vEmployeeDto.likedBy());
    }
}