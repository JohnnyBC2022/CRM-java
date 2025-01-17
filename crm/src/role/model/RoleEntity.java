package role.model;

import java.util.List;

public class RoleEntity {
     /*
    - id (String): Identificador único del rol.
    - nombre (String): Nombre del rol.
    - permisos (Lista de String): Lista de permisos asociados al rol.
     */

    private String id;
    private String name;
    private List<String> permissions;

    public RoleEntity(String id, String name, List<String> permissions) {
        this.id = id;
        this.name = name;
        this.permissions = permissions;
    }

    public RoleEntity() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<String> permissions) {
        this.permissions = permissions;
    }

    @Override
    public String toString() {
        return "RoleEntity{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", permissions=" + permissions +
                '}';
    }
}
