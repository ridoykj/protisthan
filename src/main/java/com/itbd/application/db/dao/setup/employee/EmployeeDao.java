package com.itbd.application.db.dao.setup;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_employee", indexes = {
        @Index(name = "idx_status", columnList = "tx_status"),
        @Index(name = "idx_designation", columnList = "tx_designation"),
        @Index(name = "idx_lft_rgt_index", columnList = "ct_lft, ct_rgt"),
        @Index(name = "idx_modified", columnList = "dtt_modified")
}, uniqueConstraints = {
        @UniqueConstraint(name = "uk_attendance_device_id", columnNames = {"tx_attendance_device_id"})
})
public class EmployeeDao {

    @Id
    @Column(name = "tx_name", nullable = false, updatable = false, length = 140)
    private String name;

    @Column(name = "dtt_creation")
    private LocalDateTime creation;

    @Column(name = "dtt_modified")
    private LocalDateTime modified;

    @Column(name = "tx_modified_by", length = 140)
    private String modifiedBy;

    @Column(name = "tx_owner", length = 140)
    private String owner;

    @Column(name = "is_doc_status", nullable = false)
    @ColumnDefault("0")
    private Boolean isDocStatus;

    @Column(name = "ct_idx", nullable = false)
    @ColumnDefault("0")
    private Integer idx;

    @Column(name = "tx_employee", length = 140)
    private String employee;

    @Column(name = "tx_naming_series", length = 140)
    private String namingSeries;

    @Column(name = "tx_first_name", length = 140)
    private String firstName;

    @Column(name = "tx_middle_name", length = 140)
    private String middleName;

    @Column(name = "tx_last_name", length = 140)
    private String lastName;

    @Column(name = "tx_employee_name", length = 140)
    private String employeeName;

    @Column(name = "tx_gender", length = 140)
    private String gender;

    @Column(name = "dt_dateOfBirth")
    private LocalDate dateOfBirth;

    @Column(name = "tx_salutation", length = 140)
    private String salutation;

    @Column(name = "dt_dateOfJoining")
    private LocalDate dateOfJoining;

    @Column(name = "tx_image", columnDefinition = "text")
    private String image;

    @Column(name = "tx_status", length = 140)
    @ColumnDefault("'Active'")
    private String status;

    @Column(name = "tx_user_id", length = 140)
    private String userId;

    @Column(name = "is_create_user_permission", nullable = false)
    @ColumnDefault("1")
    private Boolean createUserPermission;

    @Column(name = "tx_company", length = 140)
    private String company;

    @Column(name = "tx_department", length = 140)
    private String department;

    @Column(name = "tx_employee_number", length = 140)
    private String employeeNumber;

    @Column(name = "tx_designation", length = 140)
    private String designation;

    @Column(name = "tx_reports_to", length = 140)
    private String reportsTo;

    @Column(name = "tx_branch", length = 140)
    private String branch;

    @Column(name = "dt_scheduledConfirmationDate")
    private LocalDate scheduledConfirmationDate;

    @Column(name = "dt_finalConfirmationDate")
    private LocalDate finalConfirmationDate;

    @Column(name = "dt_contractEndDate")
    private LocalDate contractEndDate;

    @Column(name = "ct_notice_number_of_days", nullable = false)
    private Integer noticeNumberOfDays;

    @Column(name = "dt_dateOfRetirement")
    private LocalDate dateOfRetirement;

    @Column(name = "tx_cell_number", length = 140)
    private String cellNumber;

    @Column(name = "tx_personal_email", length = 140)
    private String personalEmail;

    @Column(name = "tx_company_email", length = 140)
    private String companyEmail;

    @Column(name = "tx_preferred_contact_email", length = 140)
    private String preferredContactEmail;

    @Column(name = "tx_preferred_email", length = 140)
    private String preferredEmail;

    @Column(name = "is_unsubscribed", nullable = false)
    @ColumnDefault("0")
    private Boolean unsubscribed;

    @Column(name = "tx_current_address", columnDefinition = "text")
    private String currentAddress;

    @Column(name = "tx_current_accommodation_type", length = 140)
    private String currentAccommodationType;

    @Column(name = "tx_permanent_address", columnDefinition = "text")
    private String permanentAddress;

    @Column(name = "tx_permanent_accommodation_type", length = 140)
    private String permanentAccommodationType;

    @Column(name = "tx_person_to_be_contacted", length = 140)
    private String personToBeContacted;

    @Column(name = "tx_emergency_phone_number", length = 140)
    private String emergencyPhoneNumber;

    @Column(name = "tx_relation", length = 140)
    private String relation;

    @Column(name = "tx_attendance_device_id", unique = true, length = 140)
    private String attendanceDeviceId;

    @Column(name = "tx_holiday_list", length = 140)
    private String holidayList;

    @Column(name = "flt_ctc", nullable = false, precision = 21, scale = 9)
    @ColumnDefault("0.0")
    private BigDecimal ctc;

    @Column(name = "tx_salary_currency", length = 140)
    private String salaryCurrency;

    @Column(name = "tx_salary_mode", length = 140)
    private String salaryMode;

    @Column(name = "tx_bank_name", length = 140)
    private String bankName;

    @Column(name = "tx_bank_ac_no", length = 140)
    private String bankAcNo;

    @Column(name = "tx_iban", length = 140)
    private String iban;

    @Column(name = "tx_marital_status", length = 140)
    private String maritalStatus;

    @Column(name = "tx_family_background", columnDefinition = "text")
    private String familyBackground;

    @Column(name = "tx_blood_group", length = 140)
    private String bloodGroup;

    @Column(name = "tx_health_details", columnDefinition = "text")
    private String healthDetails;

    @Column(name = "tx_passport_number", length = 140)
    private String passportNumber;

    @Column(name = "dt_validUpto")
    private LocalDate validUpto;

    @Column(name = "dt_dateOfIssue")
    private LocalDate dateOfIssue;

    @Column(name = "tx_place_of_issue", length = 140)
    private String placeOfIssue;

    @Column(name = "tx_bio", columnDefinition = "longtext")
    private String bio;

    @Column(name = "dt_resignationLetterDate")
    private LocalDate resignationLetterDate;

    @Column(name = "dt_relievingDate")
    private LocalDate relievingDate;

    @Column(name = "dt_heldOn")
    private LocalDate heldOn;

    @Column(name = "tx_new_workplace", length = 140)
    private String newWorkplace;

    @Column(name = "tx_leave_encashed", length = 140)
    private String leaveEncashed;

    @Column(name = "dt_encashmentDate")
    private LocalDate encashmentDate;

    @Column(name = "tx_reason_for_leaving", columnDefinition = "text")
    private String reasonForLeaving;

    @Column(name = "tx_feedback", columnDefinition = "text")
    private String feedback;

    @Column(name = "ct_lft", nullable = false)
    @ColumnDefault("0")
    private Integer lft;

    @Column(name = "ct_rgt", nullable = false)
    @ColumnDefault("0")
    private Integer rgt;

    @Column(name = "tx_old_parent", length = 140)
    private String oldParent;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
