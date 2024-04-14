package com.itbd.application.db.dto;

import com.itbd.application.db.dao.HelpArticleDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record HelpArticleDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String title,
        String category,
        Boolean published,
        String author,
        String level,
        String content,
        Integer likes,
        String route,
        Integer helpful,
        Integer notHelpful,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static HelpArticleDto fromEntity(HelpArticleDao eHelpArticleDao) {
        return new HelpArticleDto(
                eHelpArticleDao.getName(),
                eHelpArticleDao.getCreation(),
                eHelpArticleDao.getModified(),
                eHelpArticleDao.getModifiedBy(),
                eHelpArticleDao.getOwner(),
                eHelpArticleDao.getIsDocStatus(),
                eHelpArticleDao.getIdx(),
                eHelpArticleDao.getTitle(),
                eHelpArticleDao.getCategory(),
                eHelpArticleDao.getPublished(),
                eHelpArticleDao.getAuthor(),
                eHelpArticleDao.getLevel(),
                eHelpArticleDao.getContent(),
                eHelpArticleDao.getLikes(),
                eHelpArticleDao.getRoute(),
                eHelpArticleDao.getHelpful(),
                eHelpArticleDao.getNotHelpful(),
                eHelpArticleDao.getUserTags(),
                eHelpArticleDao.getComments(),
                eHelpArticleDao.getAssign(),
                eHelpArticleDao.getLikedBy());
    }

    public static void fromDTO(HelpArticleDto vHelpArticleDto, HelpArticleDao eHelpArticleDao) {
        eHelpArticleDao.setName(vHelpArticleDto.name());
        eHelpArticleDao.setCreation(vHelpArticleDto.creation());
        eHelpArticleDao.setModified(vHelpArticleDto.modified());
        eHelpArticleDao.setModifiedBy(vHelpArticleDto.modifiedBy());
        eHelpArticleDao.setOwner(vHelpArticleDto.owner());
        eHelpArticleDao.setIsDocStatus(vHelpArticleDto.isDocStatus());
        eHelpArticleDao.setIdx(vHelpArticleDto.idx());
        eHelpArticleDao.setTitle(vHelpArticleDto.title());
        eHelpArticleDao.setCategory(vHelpArticleDto.category());
        eHelpArticleDao.setPublished(vHelpArticleDto.published());
        eHelpArticleDao.setAuthor(vHelpArticleDto.author());
        eHelpArticleDao.setLevel(vHelpArticleDto.level());
        eHelpArticleDao.setContent(vHelpArticleDto.content());
        eHelpArticleDao.setLikes(vHelpArticleDto.likes());
        eHelpArticleDao.setRoute(vHelpArticleDto.route());
        eHelpArticleDao.setHelpful(vHelpArticleDto.helpful());
        eHelpArticleDao.setNotHelpful(vHelpArticleDto.notHelpful());
        eHelpArticleDao.setUserTags(vHelpArticleDto.userTags());
        eHelpArticleDao.setComments(vHelpArticleDto.comments());
        eHelpArticleDao.setAssign(vHelpArticleDto.assign());
        eHelpArticleDao.setLikedBy(vHelpArticleDto.likedBy());
    }
}