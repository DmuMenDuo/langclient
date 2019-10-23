package cn.iselab.webide.langclient.model;

import lombok.Data;

/**
 * @program: langclient
 * @mail: menduo96@gmail.com
 * @author: menduo
 * @create: 2019-10-23 12:21
 **/
@Data
public class TextDocumentContentChangeEvent {
    private Range range;
    private int rangeLength;
    private String text;
}
