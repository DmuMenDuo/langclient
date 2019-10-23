package cn.iselab.webide.langclient.model;

import lombok.Data;

/**
 * @program: langclient
 * @mail: menduo96@gmail.com
 * @author: menduo
 * @create: 2019-10-14 15:54
 **/
@Data
public class Params {
    private String rootPath;
    private String rootUri;
    private TextDocument textDocument;
    private Position position;
    private TextDocumentContentChangeEvent[] contentChanges;
}
