package iterator;

public class TopicList implements List<Topic> {
	
	private Topic[] topics;

    public TopicList(Topic[] t) {
        this.topics = t;
    }

    @Override
    public Iterator<Topic> iterator() {
        return new TopicListIterator(topics);
    }

}
