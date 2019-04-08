
package com.example.capp.service.article;


import com.example.capp.dto.cond.ContentCond;
import com.example.capp.model.ContentDomain;
import com.example.capp.model.MetaDomain;
import com.github.pagehelper.PageInfo;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 文章相关Service接口
 */
public interface ContentService {

    /***
     * 添加文章
     * @param contentDomain
     */
    void addArticle(ContentDomain contentDomain);

    /**
     * 根据编号获取文章
     * @param cid
     * @return
     */
    ContentDomain getArticleById(Integer cid);

    /**
     * 更新文章
     * @param contentDomain
     */
    void updateArticleById(ContentDomain contentDomain);

    /**
     * 根据条件获取文章列表
     * @param contentCond
     * @param page
     * @param limit
     * @return
     */
    PageInfo<ContentDomain> getArticlesByCond(ContentCond contentCond, int page, int limit);


    /**
     * 获取所有的文章
     * @param contentCond
     * @param page
     * @param limit
     * @return
     */
    PageInfo<ContentDomain> getArticles(ContentCond contentCond, int page, int limit);

    /***
     * 通过作者获取文章
     * @param contentCond
     * @param page
     * @param limit
     * @param request
     * @return
     */
    PageInfo<ContentDomain> getArticlesByAuthor(ContentCond contentCond, int page, int limit, HttpServletRequest request);

    /**
     * 删除文章
     * @param cid
     */
    void deleteArticleById(Integer cid);

    /**
     * 添加文章点击量
     * @param content
     */
    void updateContentByCid(ContentDomain content);

    /**
     * 通过分类获取文章
     * @param category
     * @return
     */
    List<ContentDomain> getArticleByCategory(String category);

    /**
     * 通过标签获取文章
     * @param tags
     * @return
     */
    List<ContentDomain> getArticleByTags(MetaDomain tags);


}
