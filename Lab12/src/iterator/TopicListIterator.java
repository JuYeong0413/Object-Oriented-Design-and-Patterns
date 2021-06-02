package iterator;

public class TopicListIterator implements Iterator<Topic> {
	
	private Topic[] topics;
    private int position;

    TopicListIterator(Topic[] topics) {
        this.topics = topics;
        position = 0;
    }

    @Override
    public void reset() {
        position = 0;
    }

    @Override
    public Topic next() {
    	if (this.hasNext()) return topics[position++];
    	else return null;
    }

    @Override
    public Topic currentItem() {
        return topics[position];
    }

    @Override
    public boolean hasNext() {
    	if (position < topics.length) return true;
    	else return false;
    }

}
