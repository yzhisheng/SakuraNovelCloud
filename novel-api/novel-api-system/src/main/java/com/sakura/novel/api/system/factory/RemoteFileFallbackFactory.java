package com.sakura.novel.api.system.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.sakura.novel.api.system.RemoteFileService;
import com.sakura.novel.api.system.domain.SysFile;
import com.sakura.novel.common.core.domain.R;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

/**
 * 文件服务降级处理
 * 
 * @author ruoyi
 */
@Component
public class RemoteFileFallbackFactory implements FallbackFactory<RemoteFileService>
{
    private static final Logger log = LoggerFactory.getLogger(RemoteFileFallbackFactory.class);

    @Override
    public RemoteFileService create(Throwable throwable)
    {
        log.error("文件服务调用失败:{}", throwable.getMessage());
        return new RemoteFileService()
        {
            @Override
            public R<SysFile> upload(MultipartFile file)
            {
                return R.fail("上传文件失败:" + throwable.getMessage());
            }

            @Override
            public R<Boolean> delete(String fileUrl)
            {
                return R.fail("删除文件失败:" + throwable.getMessage());
            }
        };
    }
}
