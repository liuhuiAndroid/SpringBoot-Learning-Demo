package com.didispace.study.config;

//@Configuration
//@EnableTransactionManagement
//@EnableJpaRepositories(
//        entityManagerFactoryRef="entityManagerFactorySecondary",
//        transactionManagerRef="transactionManagerSecondary",
//        basePackages= { "com.didispace.study.domain.s" }) //设置Repository所在位置
public class SecondaryConfig {

//    @Autowired @Qualifier("secondaryDataSource")
//    private DataSource secondaryDataSource;
//
//    @Bean(name = "entityManagerSecondary")
//    public EntityManager entityManager(EntityManagerFactoryBuilder builder) {
//        return entityManagerFactorySecondary(builder).getObject().createEntityManager();
//    }
//
//    @Bean(name = "entityManagerFactorySecondary")
//    public LocalContainerEntityManagerFactoryBean entityManagerFactorySecondary (EntityManagerFactoryBuilder builder) {
//        return builder
//                .dataSource(secondaryDataSource)
//                .properties(getVendorProperties(secondaryDataSource))
//                .packages("com.didispace.study.domain.s") //设置实体类所在位置
//                .persistenceUnit("secondaryPersistenceUnit")
//                .build();
//    }
//
//    @Autowired
//    private JpaProperties jpaProperties;
//
//    private Map<String, String> getVendorProperties(DataSource dataSource) {
//        return jpaProperties.getHibernateProperties(dataSource);
//    }
//
//    @Bean(name = "transactionManagerSecondary")
//    PlatformTransactionManager transactionManagerSecondary(EntityManagerFactoryBuilder builder) {
//        return new JpaTransactionManager(entityManagerFactorySecondary(builder).getObject());
//    }

}