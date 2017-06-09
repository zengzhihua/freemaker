package ${packageName};
 
/**
 *  <#if author == "zengzhihua"> @author zengzhihua </#if>
 */
public class ${className} {
    <#list attrs as a> 
    private ${a.type} ${a.field};
    </#list>
    
    <#list attrs as a>
    public void set${a.field?cap_first}(${a.type} ${a.field}){
        this.${a.field} = ${a.field};
    }
    
    public ${a.type} get${a.field?cap_first}(){
        return this.${a.field};
    }
    
    </#list>
}