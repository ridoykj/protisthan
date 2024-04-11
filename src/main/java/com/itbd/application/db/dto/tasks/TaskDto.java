package com.itbd.application.db.dto.tasks;

import com.itbd.application.db.dao.tasks.TaskDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public record TaskDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String subject,
        String project,
        String issue,
        String type,
        String color,
        Boolean isGroup,
        Boolean isTemplate,
        String status,
        String priority,
        BigDecimal taskWeight,
        String parentTask,
        String completedBy,
        LocalDate completedOn,
        LocalDate expStartDate,
        BigDecimal expectedTime,
        Integer start,
        LocalDate expEndDate,
        BigDecimal progress,
        Integer duration,
        Boolean isMilestone,
        String description,
        String dependsOnTasks,
        LocalDate actStartDate,
        BigDecimal actualTime,
        LocalDate actEndDate,
        BigDecimal totalCostingAmount,
        BigDecimal totalBillingAmount,
        LocalDate reviewDate,
        LocalDate closingDate,
        String department,
        String company,
        Integer lft,
        Integer rgt,
        String oldParent,
        String templateTask,
        String userTags,
        String comments,
        String assign,
        String likedBy,
        String seen
) {
    public static TaskDto fromEntity(TaskDao eTaskDao) {
        return new TaskDto(
                eTaskDao.getName(),
                eTaskDao.getCreation(),
                eTaskDao.getModified(),
                eTaskDao.getModifiedBy(),
                eTaskDao.getOwner(),
                eTaskDao.getIsDocStatus(),
                eTaskDao.getIdx(),
                eTaskDao.getSubject(),
                eTaskDao.getProject(),
                eTaskDao.getIssue(),
                eTaskDao.getType(),
                eTaskDao.getColor(),
                eTaskDao.getIsGroup(),
                eTaskDao.getIsTemplate(),
                eTaskDao.getStatus(),
                eTaskDao.getPriority(),
                eTaskDao.getTaskWeight(),
                eTaskDao.getParentTask(),
                eTaskDao.getCompletedBy(),
                eTaskDao.getCompletedOn(),
                eTaskDao.getExpStartDate(),
                eTaskDao.getExpectedTime(),
                eTaskDao.getStart(),
                eTaskDao.getExpEndDate(),
                eTaskDao.getProgress(),
                eTaskDao.getDuration(),
                eTaskDao.getIsMilestone(),
                eTaskDao.getDescription(),
                eTaskDao.getDependsOnTasks(),
                eTaskDao.getActStartDate(),
                eTaskDao.getActualTime(),
                eTaskDao.getActEndDate(),
                eTaskDao.getTotalCostingAmount(),
                eTaskDao.getTotalBillingAmount(),
                eTaskDao.getReviewDate(),
                eTaskDao.getClosingDate(),
                eTaskDao.getDepartment(),
                eTaskDao.getCompany(),
                eTaskDao.getLft(),
                eTaskDao.getRgt(),
                eTaskDao.getOldParent(),
                eTaskDao.getTemplateTask(),
                eTaskDao.getUserTags(),
                eTaskDao.getComments(),
                eTaskDao.getAssign(),
                eTaskDao.getLikedBy(),
                eTaskDao.getSeen());
    }

    public static void fromDTO(TaskDto vTaskDto, TaskDao eTaskDao) {
        eTaskDao.setName(vTaskDto.name());
        eTaskDao.setCreation(vTaskDto.creation());
        eTaskDao.setModified(vTaskDto.modified());
        eTaskDao.setModifiedBy(vTaskDto.modifiedBy());
        eTaskDao.setOwner(vTaskDto.owner());
        eTaskDao.setIsDocStatus(vTaskDto.isDocStatus());
        eTaskDao.setIdx(vTaskDto.idx());
        eTaskDao.setSubject(vTaskDto.subject());
        eTaskDao.setProject(vTaskDto.project());
        eTaskDao.setIssue(vTaskDto.issue());
        eTaskDao.setType(vTaskDto.type());
        eTaskDao.setColor(vTaskDto.color());
        eTaskDao.setIsGroup(vTaskDto.isGroup());
        eTaskDao.setIsTemplate(vTaskDto.isTemplate());
        eTaskDao.setStatus(vTaskDto.status());
        eTaskDao.setPriority(vTaskDto.priority());
        eTaskDao.setTaskWeight(vTaskDto.taskWeight());
        eTaskDao.setParentTask(vTaskDto.parentTask());
        eTaskDao.setCompletedBy(vTaskDto.completedBy());
        eTaskDao.setCompletedOn(vTaskDto.completedOn());
        eTaskDao.setExpStartDate(vTaskDto.expStartDate());
        eTaskDao.setExpectedTime(vTaskDto.expectedTime());
        eTaskDao.setStart(vTaskDto.start());
        eTaskDao.setExpEndDate(vTaskDto.expEndDate());
        eTaskDao.setProgress(vTaskDto.progress());
        eTaskDao.setDuration(vTaskDto.duration());
        eTaskDao.setIsMilestone(vTaskDto.isMilestone());
        eTaskDao.setDescription(vTaskDto.description());
        eTaskDao.setDependsOnTasks(vTaskDto.dependsOnTasks());
        eTaskDao.setActStartDate(vTaskDto.actStartDate());
        eTaskDao.setActualTime(vTaskDto.actualTime());
        eTaskDao.setActEndDate(vTaskDto.actEndDate());
        eTaskDao.setTotalCostingAmount(vTaskDto.totalCostingAmount());
        eTaskDao.setTotalBillingAmount(vTaskDto.totalBillingAmount());
        eTaskDao.setReviewDate(vTaskDto.reviewDate());
        eTaskDao.setClosingDate(vTaskDto.closingDate());
        eTaskDao.setDepartment(vTaskDto.department());
        eTaskDao.setCompany(vTaskDto.company());
        eTaskDao.setLft(vTaskDto.lft());
        eTaskDao.setRgt(vTaskDto.rgt());
        eTaskDao.setOldParent(vTaskDto.oldParent());
        eTaskDao.setTemplateTask(vTaskDto.templateTask());
        eTaskDao.setUserTags(vTaskDto.userTags());
        eTaskDao.setComments(vTaskDto.comments());
        eTaskDao.setAssign(vTaskDto.assign());
        eTaskDao.setLikedBy(vTaskDto.likedBy());
        eTaskDao.setSeen(vTaskDto.seen());
    }
}