package com.itbd.application.db.dao.contacts;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_contact", indexes = {
        @Index(name = "idx_email_id", columnList = "tx_email_id"),
        @Index(name = "idx_modified", columnList = "dtt_modified")
})
public class ContactDao {

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

    @Column(name = "tx_first_name", length = 140)
    private String firstName;

    @Column(name = "tx_middle_name", length = 140)
    private String middleName;

    @Column(name = "tx_last_name", length = 140)
    private String lastName;

    @Column(name = "tx_full_name", length = 140)
    private String fullName;

    @Column(name = "tx_email_id", length = 140)
    private String emailId;

    @Column(name = "tx_user", length = 140)
    private String user;

    @Column(name = "tx_address", length = 140)
    private String address;

    @Column(name = "is_sync_with_google_contacts", nullable = false)
    @ColumnDefault("0")
    private Boolean syncWithGoogleContacts;

    @Column(name = "tx_status", length = 140)
    @ColumnDefault("'Passive'")
    private String status;

    @Column(name = "tx_salutation", length = 140)
    private String salutation;

    @Column(name = "tx_designation", length = 140)
    private String designation;

    @Column(name = "tx_gender", length = 140)
    private String gender;

    @Column(name = "tx_phone", length = 140)
    private String phone;

    @Column(name = "tx_mobile_no", length = 140)
    private String mobileNo;

    @Column(name = "tx_company_name", length = 140)
    private String companyName;

    @Column(name = "tx_image", columnDefinition = "text")
    private String image;

    @Column(name = "tx_google_contacts", length = 140)
    private String googleContacts;

    @Column(name = "tx_google_contacts_id", length = 140)
    private String googleContactsId;

    @Column(name = "is_pulled_from_google_contacts", nullable = false)
    @ColumnDefault("0")
    private Boolean pulledFromGoogleContacts;

    @Column(name = "is_primary_contact", nullable = false)
    @ColumnDefault("0")
    private Boolean isPrimaryContact;

    @Column(name = "tx_department", length = 140)
    private String department;

    @Column(name = "is_unsubscribed", nullable = false)
    @ColumnDefault("0")
    private Boolean unsubscribed;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

    @Column(name = "is_isBillingContact", nullable = false)
    @ColumnDefault("0")
    private Boolean isBillingContact;

}
