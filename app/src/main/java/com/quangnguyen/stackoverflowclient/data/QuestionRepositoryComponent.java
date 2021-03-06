package com.quangnguyen.stackoverflowclient.data;

import com.quangnguyen.stackoverflowclient.data.repository.QuestionRepository;
import com.quangnguyen.stackoverflowclient.AppModule;
import dagger.Component;
import javax.inject.Singleton;

/**
 * @author QuangNguyen (quangctkm9207).
 */
@Singleton
@Component(modules = { QuestionRepositoryModule.class, AppModule.class, ApiServiceModule.class,
    DatabaseModule.class})
public interface QuestionRepositoryComponent {
  QuestionRepository provideQuestionRepository();
}
