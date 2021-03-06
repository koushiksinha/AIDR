package qa.qcri.aidr.manager.service;

import java.util.List;

import qa.qcri.aidr.manager.dto.CollectionDataResponse;
import qa.qcri.aidr.manager.dto.FetcherRequestDTO;
import qa.qcri.aidr.manager.hibernateEntities.AidrCollection;

public interface CollectionService {

	public void update(AidrCollection collection) throws Exception;
	public void delete(AidrCollection collection) throws Exception;
	public void create(AidrCollection collection) throws Exception;
	public AidrCollection findById(Integer id) throws Exception; 
	public AidrCollection findByCode(String code) throws Exception;
	public CollectionDataResponse findAll(Integer start , Integer limit,Integer userId) throws Exception;
	public List<AidrCollection> searchByName(String query,Integer userId) throws Exception;
	public Boolean exist(String code) throws Exception; 
	public AidrCollection getRunningCollectionStatusByUser(Integer userId) throws Exception; 
	public AidrCollection updateAndGetRunningCollectionStatusByUser(Integer userId) throws Exception;
	public AidrCollection start(Integer collectionId,Integer userId) throws Exception;
	public AidrCollection stop(Integer collectionId) throws Exception; 
	public AidrCollection statusById(Integer collectionId) throws Exception;
	public AidrCollection stopAidrFetcher(AidrCollection collection) throws Exception;
    public AidrCollection startFetcher(FetcherRequestDTO fetcherRequest, AidrCollection aidrCollection) throws Exception;
    public FetcherRequestDTO prepareFetcherRequest(AidrCollection dbCollection);
}
