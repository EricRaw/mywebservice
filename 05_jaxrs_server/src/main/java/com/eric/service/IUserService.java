package com.eric.service;

import com.eric.entity.User;

import javax.ws.rs.*;
import java.util.List;

/**
 * @author EricRaww
 * @create 2020-11-14
 */
@Path("/userService")
@Produces("*/*")
public interface IUserService {
    @POST
    @Path("/user")
    @Consumes({"application/xml","application/json"})
    public void saveUser(User user);

    @PUT
    @Path("/user")
    @Consumes({"application/xml","application/json"})
    public void updateUser(User user);

    @GET
    @Path("/user")
    /**
     * @getUser 服务端支持的相应的数据格式
     */
    @Produces({"application/xml","application/json"})
    public List<User> findAllUsers();

    @GET
    @Path("/user/{id}")
    @Consumes("application/xml")
    @Produces({"application/xml","application/json"})
    public User findUserById(@PathParam("id") Integer id);

    @DELETE
    @Path("/user/{id}")
    @Consumes({"application/xml","application/json"})
    public void deleteUser(@PathParam("id") Integer id);
}
