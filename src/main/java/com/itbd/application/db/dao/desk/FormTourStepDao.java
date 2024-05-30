package com.itbd.application.db.dao.desk;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_form_tour_step", indexes = {
        @Index(name = "idx_parent", columnList = "tx_parent")
})
public class FormTourStepDao {

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

    @Column(name = "is_ui_tour", nullable = false)
    @ColumnDefault("0")
    private Boolean uiTour;

    @Column(name = "is_table_field", nullable = false)
    @ColumnDefault("0")
    private Boolean isTableField;

    @Column(name = "tx_title", length = 140)
    private String title;

    @Column(name = "tx_parent_field_name", length = 140)
    private String parentFieldName;

    @Column(name = "tx_field_name", length = 140)
    private String fieldName;

    @Column(name = "tx_element_selector", length = 140)
    private String elementSelector;

    @Column(name = "tx_parent_element_selector", length = 140)
    private String parentElementSelector;

    @Column(name = "tx_description", columnDefinition = "longtext")
    private String description;

    @Column(name = "tx_ondemand_description", columnDefinition = "longtext")
    private String ondemandDescription;

    @Column(name = "tx_position", length = 140)
    @ColumnDefault("'Bottom'")
    private String position;

    @Column(name = "is_hide_buttons", nullable = false)
    @ColumnDefault("0")
    private Boolean hideButtons;

    @Column(name = "is_popover_element", nullable = false)
    @ColumnDefault("0")
    private Boolean popoverElement;

    @Column(name = "is_modal_trigger", nullable = false)
    @ColumnDefault("0")
    private Boolean modalTrigger;

    @Column(name = "ct_offset_x", nullable = false)
    private Integer offsetX;

    @Column(name = "ct_offset_y", nullable = false)
    private Integer offsetY;

    @Column(name = "is_next_on_click", nullable = false)
    @ColumnDefault("0")
    private Boolean nextOnClick;

    @Column(name = "tx_label", length = 140)
    private String label;

    @Column(name = "tx_field_type", length = 140)
    @ColumnDefault("'0'")
    private String fieldType;

    @Column(name = "is_has_next_condition", nullable = false)
    @ColumnDefault("0")
    private Boolean hasNextCondition;

    @Column(name = "tx_next_step_condition", columnDefinition = "longtext")
    private String nextStepCondition;

    @Column(name = "tx_next_form_tour", length = 140)
    private String nextFormTour;

    @Column(name = "tx_child_doc_type", length = 140)
    private String childDocType;

    @Column(name = "tx_parent", length = 140)
    private String parent;

    @Column(name = "tx_parent_field", length = 140)
    private String parentField;

    @Column(name = "tx_parent_type", length = 140)
    private String parentType;

}
