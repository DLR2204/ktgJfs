const CustomValidator = {
    firstname: {
      rules: [
        {
          test: /^[a-z0-9_]+$/,
          message: 'Username must contain only alphabets-numeric lowercase characters',
        },
        {
          test: (value) => {
            return value.length > 2;
          },
          message: 'Username must be longer than two characters',
        },
      ],
      errors: [],
      valid: false,
      state: '',
    },
    lastname:  {
        rules: [
          {
            test: /^[a-z0-9_]+$/,
            message: 'Username must contain only alphabets-numeric lowercase characters',
          },
          {
            test: (value) => {
              return value.length > 2;
            },
            message: 'Username must be longer than two characters',
          },
        ],
      errors: [],
      valid: false,
      state: ''
    },
  };
  
  export default CustomValidator;
  