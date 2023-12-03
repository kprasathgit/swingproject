package com.mkp.hotelroombooking.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.mkp.hotelroombooking.model.RoomMaster;

public interface RoomMasterDao {

	
	public String roomNo() throws Exception;
	
	public void roomMasterSave(RoomMaster roomMaster) throws Exception ;
	
	public List<RoomMaster> roomMasterView() throws Exception;
	
	public void roomMasterDelete(int roomNo) throws Exception ;
	
	public void roomMasterUpdate(RoomMaster roomMaster) throws Exception;
	public List<String> roomMasterStatus() throws Exception;
	
	public List<String> getRoomType() throws Exception;
	
	public void updateRoomNo(int roomNo) throws Exception;
	
	public double getAmount(int roomNo) throws Exception;
	public List<Integer> roomMasterRooms() throws Exception;
	
	public Map<Integer, Integer> getRoomsAndVacancy() throws Exception;
	
	public ArrayList<Integer> getRooms(String roomType) throws Exception;
	
	public void roomMasterOccupancyUpdateFrmOutstandingEntry(int bookingNo) throws Exception ;
	
	public void roomMasterReserveUpdateFrmOutstandingView(int bookingNo) throws Exception;
	
	public Map<Integer, RoomMaster> getRoomDetailsForPrint() throws Exception;
	
	
}
