package DAO.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Connection.DBConnection_20133069;
import DAO.IVideoDAO_20133069;
import Model.VideoModel_20133069;

public class VideoDAOImpl_20133069 extends DBConnection_20133069 implements IVideoDAO_20133069{

	@Override
	public void insert(VideoModel_20133069 video) {
	String sql = "INSERT Videos(Title, Poster, Views, Description, Active, CategoryId) VALUES (?, ?, ?, ?, ?, ?)";
		
		try {
			Connection con = super.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, video.getTitle());
			ps.setString(2, video.getPoster());
			ps.setInt(3, video.getViews());
			ps.setString(4, video.getDescription());
			ps.setInt(5, video.getActive());
			ps.setInt(6, video.getCategoryId());
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void edit(VideoModel_20133069 video) {
		String sql = "UPDATE dbo.Videos SET Title = ?, Poster = ?, Views = ?, Description = ?, Active = ?, CategoryId = ? WHERE VideoId = ?";
		try {
			Connection con = super.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, video.getTitle());
			ps.setString(2, video.getPoster());
			ps.setInt(3, video.getViews());
			ps.setString(4, video.getDescription());
			ps.setInt(5, video.getActive());
			ps.setInt(6, video.getCategoryId());
			ps.setInt(7, video.getVideoId());
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void delete(int id) {
		String sql = "DELETE FROM dbo.Videos WHERE VideoId = ?";
		
		try {
			Connection con = super.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<VideoModel_20133069> getAll() {
		List<VideoModel_20133069> list = new ArrayList<VideoModel_20133069>();
		String sql = "SELECT * FROM Videos";
		try {
			Connection conn = super.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new VideoModel_20133069(rs.getInt(1), rs.getString(2), rs.getString(3),
						rs.getInt(4), rs.getString(5), rs.getInt(6), rs.getInt(7)));
			}
			return list;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public VideoModel_20133069 get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public VideoModel_20133069 get(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<VideoModel_20133069> pagingVideo(int index) {
		List<VideoModel_20133069> list = new ArrayList<VideoModel_20133069>();
		String sql = "SELECT * FROM Videos ORDER BY VideoId OFFSET ? ROW FETCH NEXT 6 ROWS ONLY";
		try {
			Connection conn = super.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, (index-1)*6);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new VideoModel_20133069(rs.getInt(1), rs.getString(2), rs.getString(3),
						rs.getInt(4), rs.getString(5), rs.getInt(6), rs.getInt(7)));
			}
			return list;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
