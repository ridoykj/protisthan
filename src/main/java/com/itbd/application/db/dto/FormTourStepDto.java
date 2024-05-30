package com.itbd.application.db.dto;

import com.itbd.application.db.dao.desk.FormTourStepDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record FormTourStepDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        Boolean uiTour,
        Boolean isTableField,
        String title,
        String parentFieldName,
        String fieldName,
        String elementSelector,
        String parentElementSelector,
        String description,
        String ondemandDescription,
        String position,
        Boolean hideButtons,
        Boolean popoverElement,
        Boolean modalTrigger,
        Integer offsetX,
        Integer offsetY,
        Boolean nextOnClick,
        String label,
        String fieldType,
        Boolean hasNextCondition,
        String nextStepCondition,
        String nextFormTour,
        String childDocType,
        String parent,
        String parentField,
        String parentType
) {
    public static FormTourStepDto fromEntity(FormTourStepDao eFormTourStepDao) {
        return new FormTourStepDto(
                eFormTourStepDao.getName(),
                eFormTourStepDao.getCreation(),
                eFormTourStepDao.getModified(),
                eFormTourStepDao.getModifiedBy(),
                eFormTourStepDao.getOwner(),
                eFormTourStepDao.getIsDocStatus(),
                eFormTourStepDao.getIdx(),
                eFormTourStepDao.getUiTour(),
                eFormTourStepDao.getIsTableField(),
                eFormTourStepDao.getTitle(),
                eFormTourStepDao.getParentFieldName(),
                eFormTourStepDao.getFieldName(),
                eFormTourStepDao.getElementSelector(),
                eFormTourStepDao.getParentElementSelector(),
                eFormTourStepDao.getDescription(),
                eFormTourStepDao.getOndemandDescription(),
                eFormTourStepDao.getPosition(),
                eFormTourStepDao.getHideButtons(),
                eFormTourStepDao.getPopoverElement(),
                eFormTourStepDao.getModalTrigger(),
                eFormTourStepDao.getOffsetX(),
                eFormTourStepDao.getOffsetY(),
                eFormTourStepDao.getNextOnClick(),
                eFormTourStepDao.getLabel(),
                eFormTourStepDao.getFieldType(),
                eFormTourStepDao.getHasNextCondition(),
                eFormTourStepDao.getNextStepCondition(),
                eFormTourStepDao.getNextFormTour(),
                eFormTourStepDao.getChildDocType(),
                eFormTourStepDao.getParent(),
                eFormTourStepDao.getParentField(),
                eFormTourStepDao.getParentType());
    }

    public static void fromDTO(FormTourStepDto vFormTourStepDto, FormTourStepDao eFormTourStepDao) {
        eFormTourStepDao.setName(vFormTourStepDto.name());
        eFormTourStepDao.setCreation(vFormTourStepDto.creation());
        eFormTourStepDao.setModified(vFormTourStepDto.modified());
        eFormTourStepDao.setModifiedBy(vFormTourStepDto.modifiedBy());
        eFormTourStepDao.setOwner(vFormTourStepDto.owner());
        eFormTourStepDao.setIsDocStatus(vFormTourStepDto.isDocStatus());
        eFormTourStepDao.setIdx(vFormTourStepDto.idx());
        eFormTourStepDao.setUiTour(vFormTourStepDto.uiTour());
        eFormTourStepDao.setIsTableField(vFormTourStepDto.isTableField());
        eFormTourStepDao.setTitle(vFormTourStepDto.title());
        eFormTourStepDao.setParentFieldName(vFormTourStepDto.parentFieldName());
        eFormTourStepDao.setFieldName(vFormTourStepDto.fieldName());
        eFormTourStepDao.setElementSelector(vFormTourStepDto.elementSelector());
        eFormTourStepDao.setParentElementSelector(vFormTourStepDto.parentElementSelector());
        eFormTourStepDao.setDescription(vFormTourStepDto.description());
        eFormTourStepDao.setOndemandDescription(vFormTourStepDto.ondemandDescription());
        eFormTourStepDao.setPosition(vFormTourStepDto.position());
        eFormTourStepDao.setHideButtons(vFormTourStepDto.hideButtons());
        eFormTourStepDao.setPopoverElement(vFormTourStepDto.popoverElement());
        eFormTourStepDao.setModalTrigger(vFormTourStepDto.modalTrigger());
        eFormTourStepDao.setOffsetX(vFormTourStepDto.offsetX());
        eFormTourStepDao.setOffsetY(vFormTourStepDto.offsetY());
        eFormTourStepDao.setNextOnClick(vFormTourStepDto.nextOnClick());
        eFormTourStepDao.setLabel(vFormTourStepDto.label());
        eFormTourStepDao.setFieldType(vFormTourStepDto.fieldType());
        eFormTourStepDao.setHasNextCondition(vFormTourStepDto.hasNextCondition());
        eFormTourStepDao.setNextStepCondition(vFormTourStepDto.nextStepCondition());
        eFormTourStepDao.setNextFormTour(vFormTourStepDto.nextFormTour());
        eFormTourStepDao.setChildDocType(vFormTourStepDto.childDocType());
        eFormTourStepDao.setParent(vFormTourStepDto.parent());
        eFormTourStepDao.setParentField(vFormTourStepDto.parentField());
        eFormTourStepDao.setParentType(vFormTourStepDto.parentType());
    }
}